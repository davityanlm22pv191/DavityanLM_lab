package tech.reliab.course.davityanlm.bank.service;

import tech.reliab.course.davityanlm.bank.entity.User;

import java.time.LocalDate;

/** Интерфейс операций, связанных с классом {@link User}
 * @version 0.1 */
public interface UserService {


    /** Процедура создания экземпляра {@link User} */
    void createUser (Integer id, String fullName, LocalDate birthDate, String workPlace);

    /** Функция получения экземпляра {@link User}
     * @param id идентификатор пользователя
     * @return объект класса {@link User}*/
    User getUser(Integer id);

    /**
     * Процедура смены места работы
     * @param user      клиент, которому необходимо сменить место работы
     * @param workPlace место работы клиента
     */
    void changeWorkPlace(User user, String workPlace);
}
