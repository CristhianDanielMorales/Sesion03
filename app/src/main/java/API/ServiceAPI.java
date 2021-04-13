package API;

import java.util.List;

import entity.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceAPI {
    //https://jsonplaceholder.typicode.com/posts

    @GET("users")
    public abstract Call<List<User>> listaUsuario();

}
