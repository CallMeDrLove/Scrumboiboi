package sample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcTest {

    static final String username = "root";
    static final String password = "mySQL_Password123";
    static final String jdbcConnection = "jdbc:mysql://127.0.0.1:3306/sakila";
    //
    private static Connection connection = null;
    private  Statement statement = null;
    private ResultSet resultSet = null;

    private PreparedStatement preparedStatement;

    public static void ConnectToDB(){
        try{
            connection = DriverManager.getConnection(jdbcConnection,username,password);
        }catch (SQLException q){
        }
    }

    public  ArrayList<FilmObject> filmObjects(){
        ArrayList<FilmObject> filmObjectArrayList = new ArrayList<>();
        try {

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM sakila.film a \n" +
                    "inner join film_category f\n" +
                    "on a.film_id = f.film_id\n" +
                    "inner join category c on \n" +
                    "f.category_id = c.category_id\n" +
                    "inner join language la \n" +
                    "on  a.language_id = la.language_id\n" +
                    "order by a.film_id");

            while (resultSet.next()){
                FilmObject object =  new FilmObject(resultSet.getInt("film_id"),resultSet.getString("title"),resultSet.getString("description"),resultSet.getString("release_year"),resultSet.getString(21), resultSet.getDouble("rental_duration"),
                        resultSet.getDouble("rental_rate"), resultSet.getInt("length"), resultSet.getDouble("replacement_cost"), resultSet.getString("special_features"),resultSet.getString("rating"),resultSet.getString(18));
                filmObjectArrayList.add(object);
            }
        }catch (SQLException e){

        }
        return filmObjectArrayList;
    }

}
