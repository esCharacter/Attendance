# attendance

# 考勤管理系统

## 后台：Spring boot + MySQL

## 命名规范
 
### 数据库命名：
  1. 表和属性命名一律是小写字母+下划线；
  2. 实体表以名词命名(user,leave)，关系表以实体表名组合命名(user_leave)；
  3. 实体表主键一律使用id（int）,关系表主键为实体id组合；
  如：用户表user，用户名user_name；请假表leavebill，外出日期leave_date;用户请假关系表user_leave。  （注意：为避免与数据库关键字冲突，避免使用常见词，如：leave,group等）
  
### 实体类和关系类命名：
  1. 实体类属性与数据库实体属性需一致；
  2. 实体类类名首字母大写，属性名使用驼峰命名法，与数据库实体属性名相同，如用户类User，用户名userName；

### URI命名：
  1. 尽量使用名词；
  2. 使用驼峰命名法，如：根据请假天数,查询请假信息,/leavebill/leaveNumDay;
  3. 传递变量使用驼峰命名，如：请假天数，/leavebill/leaveNumDay？leaveNumDay=1；
