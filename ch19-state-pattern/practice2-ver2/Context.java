public interface Context {
    public abstract void setClock(int hour); // 시간 설정
    public abstract void changeState(State state); // 상태 변화
    public abstract void callSecurityCenter(String msg); // 경비 센터 경비원 호출
    public abstract void recordLog(String msg);	// 경비 센터 기록
    public abstract boolean isDay(int hour); // 주간 시간 확인
    public abstract boolean isNight(int hour); // 야간 시간 확인
}
