https://www.bilibili.com/video/av38320645/?p=17 

终于有个老哥把问题讲清楚了

- xmlns:xsi 表明这是一个schema 的instance,值已经固定，不能修改
- xmlns 必须是schema中的targetNamespace
- xsi:schemaLocation {namespace} {schema location}
  - schema location 可以是本地也可以是网络上临时下载的
  - 可以跟多个键值对

- 没有schema的话也可以表达信息，但是有的解析器会报错，比如spring