package a1_BI12_215;
import java.io.IOException;
import javax.validation.ConstraintViolationException;
import utils.*;
public class UndergradStudent{
    @DomainConstraint(type = "String", mutable = false, optional = false, min=100000,max=100000000)
    private String id;
    @DomainConstraint(type = "String", mutable = true, optional = false, length=50)
    private String name;
    @DomainConstraint(type = "String", mutable = true, optional = false, length=10)
    private String phoneNumber;
    @DomainConstraint(type = "String", mutable = true, optional = false, length=100)
    private String address;

    public UndergradStudent(@AttrRef("id") String id, @AttrRef("name") String name, @AttrRef("phoneNumber") String phoneNumber, @AttrRef("address") String address) throws ConstraintViolationException, IOException {
        this.setId(id);
        this.setName(name);
        this.setPhoneNumber(phoneNumber);
        this.setAddress(address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) throws ConstraintViolationException, IOException {
        if (id == null || id.length() == 0) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student ID cannot be null or empty");
        }
        if (id.length() > 100000000) {
            throw new ConstraintViolationException(ErrorCode.INVALID_INPUT, "Student ID cannot be longer than 100000000 characters");
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

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UndergradStudent other = (UndergradStudent) obj;
        if ((this.id == null) ? (other.id != null) : !this.id.equals(other.id)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.phoneNumber == null) ? (other.phoneNumber != null) : !this.phoneNumber.equals(other.phoneNumber)) {
            return false;
        }
        if ((this.address == null) ? (other.address != null) : !this.address.equals(other.address)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 97 * hash + (this.phoneNumber != null ? this.phoneNumber.hashCode() : 0);
        hash = 97 * hash + (this.address != null ? this.address.hashCode() : 0);
        return hash;
    }
}