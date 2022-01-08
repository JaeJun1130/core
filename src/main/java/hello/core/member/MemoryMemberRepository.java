package hello.core.member;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MemoryMemberRepository implements  MemberRepository{
    //ThreadSafe
    private static final ConcurrentHashMap<Long,Member> STORE = new ConcurrentHashMap<>();

    @Override
    public void save(Member member) {
        STORE.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return STORE.get(memberId);
    }
}
