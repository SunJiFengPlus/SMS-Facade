# 快速开始
## 配置
SpringBoot 项目中配置 yml
```yaml
sms:
  juhe:
  # lazy format, 发送时 format 剩余的参数
  urlPattern: "http://v.juhe.cn/sms/send/mobile=#{mobile}&tpl_id=#{templateId}&key=#{appKey}"
  # eager format, 可能是请求体里的参数, 也可能是 url 参数
  param:
    appKey: asdawdawdj
    templateId: 12859302
  # 调用方式
  method: get
  # 优先级, 越小优先级越高
  index: 0
``` 

## 调用
注入 Sender 后调用即可
```java
@Autowired
private Sender sender;

sender.send(Message.of(templateId, param, phone));
```