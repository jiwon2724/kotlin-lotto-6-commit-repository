package ui

class OutputManager {
    fun promptPurchaseAmount() = println(OutputMessages.PROMPT_PURCHASE_AMOUNT)
    fun invalidPurchaseAmount() = println("${OutputMessages.INVALID_PURCHASE_AMOUNT} ${OutputMessages.RE_TRY}")
    fun invalidLottoNumbers() = println("${OutputMessages.INVALID_LOTTO_NUMBERS} ${OutputMessages.RE_TRY}")
    fun purchaseLottoCount(lottoCount: Int) = println(OutputMessages.PURCHASE_LOTTO_COUNT.toString().format(lottoCount))
    fun lottoNumbers(numbers: List<Int>) = println(numbers)
    fun promptJackpotNumbers() = println(OutputMessages.PROMPT_JACKPOT_NUMBERS)
    fun promptBonusNumber() = println(OutputMessages.PROMPT_BONUS_NUMBER)
    fun lottoStats() = println(OutputMessages.LOTTO_STATS)
    fun retry() = println(OutputMessages.RE_TRY)
    fun line() = println(OutputMessages.LINE)
    fun lottoResult(
        correctLottoNumbers: Int,
        winningAmount: String,
        winningCount: Int
    ) = println(OutputMessages.LOTTO_RESULT.toString().format(correctLottoNumbers, winningAmount, winningCount))
}

enum class OutputMessages(private val message: String) {
    ERROR("[ERROR]"),
    INVALID_PURCHASE_AMOUNT("$ERROR 유효하지 않은 금액입니다."),
    INVALID_LOTTO_NUMBERS("$ERROR 로또 번호는 1부터 45 사이의 숫자여야 합니다."),
    PROMPT_PURCHASE_AMOUNT("구입금액을 입력해 주세요."),
    PROMPT_JACKPOT_NUMBERS("당첨 번호를 입력해 주세요."),
    PROMPT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    PURCHASE_LOTTO_COUNT("%d개를 구매했습니다."),
    LOTTO_RESULT("%d개 일치 (%s원) - %d개"),
    RE_TRY("다시 입력해주세요."),
    LINE("---"),
    LOTTO_STATS("당첨 통계");

    override fun toString(): String = message
}
