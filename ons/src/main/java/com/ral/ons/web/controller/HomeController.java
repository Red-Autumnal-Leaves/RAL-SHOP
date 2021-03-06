package com.ral.ons.web.controller;

import com.ral.dao.member.MemberMapper;
import com.ral.model.entity.member.MemberExample;
import com.ral.model.enums.queue.MessageQueueEnum;
import com.ral.model.res.Result;
import com.ral.service.file.IFileStoreService;
import com.ral.service.queue.IMessageQueueService;
import com.ral.service.redis.IRedisService;
import com.ral.service.session.IRedisSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author victor
 * @desc
 * @date 2018/1/5 0:40
 */
@RestController
public class HomeController {

    @Autowired
    private IRedisService redisService;

    @Autowired
    private MemberMapper memberMapper;

    @Autowired
    private IRedisSessionService redisSessionService;

    @Autowired
    private IFileStoreService fileStoreService;

    @Autowired
    private IMessageQueueService messageQueueService;

    @RequestMapping("/")
    public Result home(){
        redisService.set("test","111");
        System.out.println(redisSessionService.getKey());
        fileStoreService.testConfig();
        return Result.initSuccessResult(memberMapper.selectByExample(new MemberExample()),null);

    }

    @RequestMapping("/send/message/{message}/{times}")
    public Result sendMessage(@PathVariable("message") String message,@PathVariable("times")long times){
        messageQueueService.send(MessageQueueEnum.EXAMPLE_QUEUE,message,times);
        return Result.initSuccessResult(null,null);
    }
}
