package com.brahim.springfull.web.i18n;

import java.util.Locale;

public interface I18NService {
    String getMessage(String messageId);
    String getMessage(String messageID, Locale locale);
}
