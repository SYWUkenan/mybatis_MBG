package cn.yswu.mapper;

import cn.yswu.pojo.Actor;
import java.util.List;

public interface ActorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat Jul 17 16:17:01 CST 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat Jul 17 16:17:01 CST 2021
     */
    int insert(Actor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat Jul 17 16:17:01 CST 2021
     */
    Actor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat Jul 17 16:17:01 CST 2021
     */
    List<Actor> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor
     *
     * @mbg.generated Sat Jul 17 16:17:01 CST 2021
     */
    int updateByPrimaryKey(Actor record);
}