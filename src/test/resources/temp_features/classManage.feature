#language: zh-CN
@Class
功能: 自媒体后台基础管理-班级管理操作


 @Addclass
   场景: admin用户登录添加班级
       假设 admin登录成功，上级院系创建成功
       当 点击添加班级按键
       那么显示添加班级页面
       假设 下拉选择上级院系，并输入班级名称<className>
       当 点取消
       那么 取消创建，班级创建未成功
       当 点击添加班级按键
       那么显示添加班级页面
       假设 下拉选择上级院系，并输入班级名称<className>
       当 点确定
       那么 班级创建成功
       当 点删除班级
       那么 弹出删除班级页面
       当  取消
       那么 取消删除 ，班级未删除
       当 点删除班级
       那么 弹出删除班级页面
       当  确定
       那么班级被删除
       
          例子:班级添加测试
          |className|second_dept|third_dept|
          |			 |           |          |
          |			 |           |          |
          |			 |           |          |
          
          
          
 @Addstudent
   场景: admin用户登录添加班级
       假设 admin登录成功，上级院系创建成功
       当 点击添加班级按键
       那么显示添加班级页面
       假设 下拉选择上级院系，并输入班级名称<className>
       当 点取消
       那么 取消创建，班级创建未成功
       当 点击添加班级按键
       那么显示添加班级页面
       假设 下拉选择上级院系，并输入班级名称<className>
       当 点确定
       那么 班级创建成功  
       当 点添加学生
       那么 弹出添加学生页面
       假如  输入学生姓名<tech_name>,账号<stu_accoutId>,密码<stu_password>,学号<stu_oId>
       当 点确定
       那么 检查老师角色是否创建成功，提示<studentadd_tip>
       假设 打开学生登录界面，输入用户<stu_accoutId>，密码<stu_password>
       当 点登录
       那么 检查学生角色登录是否成功，提示<studentlogin_tip>   
       
       
  @Editstudent
       场景: admin用例登录，删除学生角色
            假设 admin登录成功，进入学生管理
            当 点编辑学生
            那么 打开编辑学生界面
            当 输入修改学生姓名，修改学生工号，修改学生密码，并点确定
            那么 检查修改是否成功
            当  打开学生登录界面，输入新用户，新密码，点登录        
            那么 检查登录是否成功
            
                
  @Deletestudent
       场景: admin用例登录，删除学生角色
            假设 admin登录成功，进入学生管理
            当 点删除学生
            那么 检查学生是否删除
            当 选择删除三级部门
            那么 检查创建的部门都被删除
       
       
       
               例子:添加学生用户测试
               
               
          |stu_name  |stu_accoutId|stu_password|stu_oId |studentadd_tip|studentlogin_tip|
          |			 |            |            |        |             |                |
          |			 |            |            |        |             |                |
          |			 |            |            |        |             |                |   
       