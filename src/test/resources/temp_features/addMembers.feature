#language: zh-CN
@Addmember
功能: 自媒体后台管理添加成员管理

 @Addteacher
   场景: admin用例登录，添加老师成员
       假设 admin登录成功
       当 点击添加用户按键
       那么 成功显示添加用户页
       假如  选择老师角色
       而且 选择多个组织
       而且 输入姓名<teh_name>,账号<teh_accoutId>,密码<teh_password>
       当 点确定
       那么 检查老师角色是否创建成功，提示<bcksign_tip>,选中多个组织都显示创建教师账号
               例子:添加教师用户测试
       
       
 @Teacherlogin      
     场景: 教师密码修改后登录
       假设 打开自媒体前台登录页
       那么 显示登录按键
       假设  输入教师账号<teh_accoutId>，密码<teh_password>
       当 点登录
       那么 检查是否登录成功,提示<front_tehsign_tip>
              例子:      
       
       
 @Addstudent      
   场景: admin用例登录，添加学生成员
       假设 admin登录成功
       当 选中组织点击添加用户按键
       那么 成功显示添加用户页
       假如  选择学生角色
       而且 选择多个组织
       而且 输入姓名<stu_name>,账号<stu_accoutId>,密码<stu_password>
       当 点确定
       那么 检查学生角色是否创建成功，提示<bcksign_tip>,选中多个组织都显示创建学生账号
              例子:添加学生用户测试
              
              
 @Studentlogin      
    场景: 学生密码修改后登录
       假设 打开自媒体前台登录页
       那么 显示登录按键
       假设  输入学生账号<stu_accoutId>，密码<stu_password>
       当 点登录
       那么 检查是否登录成功,提示<front_stusign_tip>
           例子:
                     
       
       
       
       