#language: zh-CN
@Login
功能: 自媒体后台管理登录

   场景: admin管理员登录
       假设 打开google浏览器
       当 打开自媒体后台管理页
       那么登录按键存在
       假设  输入管理员用户<user>，密码<password>
       当 点击登录按键
       那么 检查登录是否成功,提示<tip>   
       