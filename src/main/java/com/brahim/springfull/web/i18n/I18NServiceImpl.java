package com.brahim.springfull.web.i18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class I18NServiceImpl implements I18NService {

    @Autowired
    private MessageSource messageSource;

    @Override
    public String getMessage(String messageId) {
        Locale locale = LocaleContextHolder.getLocale();
        return getMessage(messageId,locale);
    }

    @Override
    public String getMessage(String messageID, Locale locale) {
        return messageSource.getMessage(messageID,null,locale);
    }
}
