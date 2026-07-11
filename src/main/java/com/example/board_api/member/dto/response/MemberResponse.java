package com.example.board_api.member.dto.response;

import com.example.board_api.member.entity.Member;
import com.example.board_api.member.type.MemberStatus;
import com.example.board_api.member.type.Role;

public record MemberResponse(

        Long id,
        String email,
        String nickname,
        Role role,
        MemberStatus status
) {

    public static MemberResponse from(Member member) {
        return new MemberResponse(
                member.getId(),
                member.getEmail(),
                member.getNickname(),
                member.getRole(),
                member.getStatus()
        );
    }
}
