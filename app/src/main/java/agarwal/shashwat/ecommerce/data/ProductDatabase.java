package agarwal.shashwat.ecommerce.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Product.class},version = 1)
public abstract class ProductDatabase extends RoomDatabase {

    public abstract ProductsDao productsDao();

   private static ProductDatabase instance;

    public static synchronized ProductDatabase getInstance(Context context){

        if (instance==null){
            instance= Room.databaseBuilder(context.getApplicationContext(),
                    ProductDatabase.class,"product_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
