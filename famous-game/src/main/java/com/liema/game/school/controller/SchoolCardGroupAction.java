package com.liema.game.school.controller;

import com.alibaba.fastjson.JSONObject;
import com.liema.common.bean.CardGroup;
import com.liema.common.exception.ErrorCode;
import com.liema.common.global.Action;
import com.liema.common.global.Resoult;
import com.liema.game.base.RegisterProtocol;
import com.liema.game.school.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author Noseparte
 * @date 2019/8/29 14:51
 * @Description
 */
@Component
public class SchoolCardGroupAction extends Action {

    @Autowired
    private SchoolService schoolService;

    @Override
    public Resoult execute(JSONObject jsonObject, HttpServletRequest request, HttpServletResponse response) {
        Long rid = jsonObject.getLong("rid");
        Integer schoolId = jsonObject.getInteger("schoolId");
        Long groupId = jsonObject.getLong("groupId");
        CardGroup cardGroup = schoolService.getOneCardGroup(rid, schoolId, groupId);
        if (Objects.isNull(cardGroup)) {
            return Resoult.error(RegisterProtocol.SCHOOL_CARD_GROUP_RESP, ErrorCode.CARD_GROUP_NOT_EXIST, "");
        }
        return Resoult.ok(RegisterProtocol.SCHOOL_CARD_GROUP_RESP).responseBody(cardGroup);
    }

}
