# 快速开始
## 配置
SpringBoot 项目中配置 yml
```yaml
sms:
  juhe:
    appKey: asdawdawdj
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