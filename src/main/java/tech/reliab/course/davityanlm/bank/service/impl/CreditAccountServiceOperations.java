package tech.reliab.course.davityanlm.bank.service.impl;

import tech.reliab.course.davityanlm.bank.entity.CreditAccount;
import tech.reliab.course.davityanlm.bank.service.CreditAccountService;

/** Класс-реализация операций кредитного счета, реализует интерфейс сервис кредитного счета {@link CreditAccountService}.
 * <br> Реализуется бизнес-логика */
public class CreditAccountServiceOperations implements CreditAccountService {

    private CreditAccountServiceOperations(){}

    public static final CreditAccountService CREDIT_ACCOUNT_SERVICE = new CreditAccountServiceOperations();

    public void subCreditSum(CreditAccount creditAccount, Integer sum){
        creditAccount.setCreditSum(creditAccount.getCreditSum() - sum);
    }

}
