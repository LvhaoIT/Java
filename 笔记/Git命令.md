```git
$ git init //初始化
$ git config user.name LvhaoIT //项目签名
$ git config user.email 1124283665@qq.com
$
$ git config --global user.name LvhaoIT //系统用户级别
$ git cofing --global user.email 1124283665@qq.com

$ git remote -v //查看远程库地址
$ git remote add origin https://github.com/LvhaoIT/Java.git //初始化地址
$ git remote set-url origin https://github.com/LvhaoIT/Java.git //修改为新地址
$ git config --global --unset http.proxy   //取消代理
$ git config --global --unset https.proxy //



$ git status //查看各区块状态
$ git add good.txt  //将good.txt加入缓冲区
$ git rm --cached good.txt  //将good从缓冲区撤回
$ git commit good.txt //将文件送入本地仓库 ，会打开vim编辑器
$ git commit -m "自己写的标签" good.txt //提交到仓库
$ cat good.txt //读取文件


推送操作
$ git push origin master //推送到master分区
$ git push -f origin master//使用本地强行覆盖云端


$ ssh-keygen -t rsa -C"1124283665@qq.com"
//创建ssh秘钥
$ cat ~/.ssh/id_rsa.pub//查看秘钥


#github
140.82.114.4 github.com
199.232.69.194 github.global.ssl.fastly.net

```

