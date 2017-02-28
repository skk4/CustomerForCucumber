#language: zh-CN
@Teachermanage
功能: 自媒体后台管理教师管理设置

 @Addteacher
   场景: admin用例登录，添加老师角色
       假设 admin登录成功，并成功添加好部门
       当 点击添加教师按键
       那么 成功显示添加教师用户页
       假如  输入教师姓名<teh_name>,账号<teh_accoutId>,密码<teh_password>,工号<teh_oId>
       当 点确定
       那么 检查老师角色是否创建成功，提示<teacheradd_tip>
       假设 打开教师登录界面，输入用户<teh_accoutId>，密码<teh_password>
       当 点登录
       那么 检查教师角色登录是否成功，提示<teacherlogin_tip>
       
       
       
  @Editteacher
       场景: admin用例登录，删除教师角色
            假设 admin登录成功，进入教师管理
            当 点编辑教师
            那么 打开编辑教师界面
            当 输入修改教师姓名，修改教师工号，修改教师密码，并点确定
            那么 检查修改是否成功
            当  打开教师登录界面，输入新用户，新密码，点登录        
            那么 检查登录是否成功
            
                
  @Deleteteacher
       场景: admin用例登录，删除教师角色
            假设 admin登录成功，进入教师管理
            当 点删除教师
            那么 检查教师是否删除
            当 选择删除三级部门
            那么 检查创建的部门都被删除
       
       
       
               例子:添加教师用户测试
               
               
          |teh_name  |teh_accoutId|teh_password|teh_oId |teacheradd_tip|teacherlogin_tip|
          |			 |            |            |        |              |                |
          |			 |            |            |        |              |                |
          |			 |            |            |        |              |                |