package agarwal.shashwat.ecommerce.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ProductsDao {


    @Update
    void update(Product product);

    @Query("SELECT * FROM product_table ORDER BY id ASC ")
    LiveData<List<Product>> showAllProducts();

}
