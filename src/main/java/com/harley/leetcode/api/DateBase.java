package com.harley.leetcode.api;

/**
 * 数据库相关
 */
public class DateBase {

    /**
     * 175. 组合两个表
     * select p.FirstName,p.LastName,a.City,a.State from Person p left join Address a on a.PersonId=p.PersonId;
     */

    /**
     * 176. 第二高的薪水
     * select ifnull((select distinct Salary from Employee order by Salary desc limit 1 offset 1),null) as SecondHighestSalary ;
     */

    /**
     * 181. 超过经理收入的员工
     * #a代表员工
     * #b代表经理
     * select a.Name as Employee  from Employee a,Employee b where a.ManagerId = b.Id and a.Salary > b.Salary;
     */

    /**
     * 182. 查找重复的电子邮箱
     * select distinct a.Email from Person  a left join Person  b on a.Email = b.Email where a.Id != b.Id;
     */

    /**
     * 183. 从不订购的客户
     * select Name as Customers from Customers where Id not in (
     *     select CustomerId from Orders
     * )
     */

    /**
     * 196. 删除重复的电子邮箱
     * delete from Person where Id not in (
     *     select Id from (
     *         select min(Id) as Id from Person
     *         group by Email
     *     ) t1
     * )
     */

    /**
     * 197. 上升的温度
     * #SELECT DATEDIFF('2008-12-29','2008-12-30') AS DiffDate
     * #注意：SQL SERVER 和 MYSQL 规则不一样
     * select b.id from Weather a,Weather b
     *     where a.temperature < b.temperature and DATEDIFF(b.recordDate,a.recordDate) = 1
     */

    /**
     * 595. 大的国家
     * select name,population,area from World where area > 3000000 or population > 25000000;
     */

    /**
     * 596. 超过5名学生的课
     * #这题的坑    可能出现A选Math  出现多条，只能算一条
     * select class from (
     *     select distinct class,student from courses
     * ) courses group by class  having count(class) >=5;
     */

    /**
     * 620. 有趣的电影
     * select * from cinema where description != 'boring' and id % 2 != 0 order by rating desc
     */

    /**
     * 627. 变更性别
     * update salary set sex = if(sex = 'm','f','m');
     */
}
