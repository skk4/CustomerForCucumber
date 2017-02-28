#language: zh-CN
@Editmember
功能: 自媒体后台管理添加成员管理

 @Editteacher
   场景: 编辑老师成员姓名和密码
       假设 教师账号创建成功
       当 点击编辑教师按键
       那么 显示教师编辑页
       假如  修改姓名<teh_name>和密码<teh_password>
       当 点确定
       那么 检查老师角色是否修改成功，提示<teh_tip>
           例子:
           
       
 @Teacherlogin      
     场景: 教师密码修改后登录
       假设 打开自媒体前台登录页
       那么 显示登录按键
       假设  输入教师账号<teh_accoutId>，密码<teh_password>
       当 点登录
       那么 检查是否登录成功,提示<front_tehsign_tip>
          例子:
          
          
 
 @Editstudent      
   场景: 编辑学生成员姓名和密码
       假设 学生账号创建成功
       当 点击编辑学生按键
       那么 显示学生编辑页
       假如  修改姓名<stu_name>和密码<stu_password>
       当 点确定
       那么 检查老师角色是否修改成功，提示<stu_tip>
            例子:
       
 @Studentlogin      
    场景: 学生密码修改后登录
       假设 打开自媒体前台登录页
       那么 显示登录按键
       假设  输入学生账号<stu_accoutId>，密码<stu_password>
       当 点登录
       那么 检查是否登录成功,提示<front_stusign_tip>
           例子:
       
       