# 快速开始
## 配置
SpringBoot 项目中配置 yml
```yaml
sms:
  // 先后顺序标识调用链先后顺序
  juhe:
    url: http://v.juhe.cn/sms/send/mobile={mobile}&tpl_id={tplId}&tpl_value={tplValue}&key={key}
    param:
      // 可以预先指定, 也可以调用时指定
      mobile: 
      tplId:
      tplValue:
      key:
``` 

## 调用
注入 Sender 后调用即可
```java
@Autowired
private Sender sender;

sender.send(Message.of(templateId, param, phone));
```