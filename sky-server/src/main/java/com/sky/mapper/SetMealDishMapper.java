package com.sky.mapper; 

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetMealDishMapper {
    List<Long> getDishIdByMealId(List<Long> ids);

    void insert(SetmealDish setmealDish);

    void deleteBatch(List<Long> ids);

    void deleteBySetmealId(Long setmealId);

    void insertBatch(@Param("setmealDishes") List<SetmealDish> setmealDishes,
                     @Param("setmealId") Long setmealId);

    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    List<SetmealDish> getByMealId(Long setmealId);
}
