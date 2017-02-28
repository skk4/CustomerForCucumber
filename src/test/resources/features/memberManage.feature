#language: zh-CN

@Member
功能: 自媒体后台成员管理

 @AddMember
   场景: 验证部门添加成员
       假设 已登录到成员管理
       当 当添加成员
       那么 检查成员是否添加成功