package pl.coderslab.advanced.dao.simple.exercise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao extends AbstractDao {

    private static final String LOAD_ALL_QUERY = "SELECT * FROM user;";
    private static final String LOAD_BY_ID_QUERY = "SELECT * FROM user WHERE id=?;";
    private static final String CREATE_QUERY = "INSERT INTO user(username, email, group_id) VALUES(?, ?, ?);";
    private static final String UPDATE_QUERY = "UPDATE user SET username=?, email=?, group_id=? WHERE id=?;";
    private static final String DELETE_QUERY = "DELETE FROM user WHERE id=?;";


    @Override
    protected Model newFromResultSet(ResultSet rs) throws SQLException {

        //pobieramy przez loadById model -> group, rzutujemy na Group i wrzucamy do new User
        GroupDao groupDao = new GroupDao();
        Model group = groupDao.loadById(rs.getInt("group_id"));
        return new User(rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                (Group) group);
    }

    @Override
    protected String getLoadAllQuery() {
        return LOAD_ALL_QUERY;
    }

    @Override
    protected String getLoadByIdQuery() {
        return LOAD_BY_ID_QUERY;
    }

    @Override
    protected PreparedStatement saveNewStatement(Connection con, Model item) throws SQLException {
        String[] genereatedColumns = { "id" };
        PreparedStatement ps = con.prepareStatement(CREATE_QUERY, genereatedColumns);
        ps.setString(1, ((User) item).getUsername());
        ps.setString(2, ((User) item).getEmail());
        ps.setLong(3, ((User) item).getGroup().getId());
        return ps;
    }

    @Override
    protected PreparedStatement updateExistingStatement(Connection con, Model item) throws SQLException {
        PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
        ps.setString(1, ((User) item).getUsername());
        ps.setString(2, ((User) item).getEmail());
        ps.setLong(3, ((User) item).getGroup().getId());
        ps.setLong(4, item.getId());
        return ps;
    }

    @Override
    protected PreparedStatement deleteStatement(Connection con, Model item) throws SQLException {
        PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
        ps.setLong(1, item.getId());
        return ps;
    }
}
