package merkanto.sdjpacreditcard.domain;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import merkanto.sdjpacreditcard.config.SpringContextHelper;
import merkanto.sdjpacreditcard.services.EncryptionService;

@Converter
public class CreditCardConverter implements AttributeConverter<String, String> {
    @Override
    public String convertToDatabaseColumn(String attribute) {
        return getEncryptionService().encrypt(attribute);
    }

    @Override
    public String convertToEntityAttribute(String dbData) {
        return getEncryptionService().decrypt(dbData);
    }

    private EncryptionService getEncryptionService() {
        return SpringContextHelper.getApplicationContext().getBean(EncryptionService.class);
    }
}
