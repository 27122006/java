package a1_BI12_215;
import java.io.IOException;
import javax.validation.ConstraintViolationException;
import utils.*;
public class PostgradStudent{
    @DomainConstraint(type = "String", mutable = false, optional = false, min=100000001,max=1000000000)
    private String id;
    @DomainConstraint(type = "String", mutable = true, optional = false, length=50)
    private String name;
    @DomainConstraint(type = "String", mutable = true, optional = false, length=10)
    private String phoneNumber;
    @DomainConstraint(type = "String", mutable = true, optional = false, length=100)
    private String address;
    @DomainConstraint(type = "Float", mutable = true, optional = false, min=0.0,max=4.0)
    private String gpa;
    
    public PostgradStudent(@AttrRef("id") String id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber, @AttrRef("address") String address, @AttrRef("gpa") String gpa) throws ConstraintViolationException, IOException {
        this.setId(id);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
        this.setGpa(gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws ConstraintViolationException, IOException {
        if (id == null || id.length() == 0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student ID cannot be null or empty");
        }
        if (id.length() < 100000001 || id.length() > 1000000000) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student ID cannot be longer than 1000000000 characters");
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws ConstraintViolationException, IOException {
        if (name == null || name.length() == 0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student name cannot be null or empty");
        }
        if (name.length() > 50) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student name cannot be longer than 50 characters");
        }
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws ConstraintViolationException, IOException {
        if (phoneNumber == null || phoneNumber.length() == 0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student phone number cannot be null or empty");
        }
        if (phoneNumber.length() > 10) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student phone number cannot be longer than 10 characters");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) throws ConstraintViolationException, IOException {
        if (address == null || address.length() == 0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student address cannot be null or empty");
        }
        if (address.length() > 100) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student address cannot be longer than 100 characters");
        }
        this.address = address;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) throws ConstraintViolationException, IOException {
        if (gpa == null || gpa.length() == 0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student GPA cannot be null or empty");
        }
        if (gpa.length() < 0.0 || gpa.length() > 4.0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student GPA cannot be longer than 4.0");
        }
        this.gpa = gpa;
    }
}


