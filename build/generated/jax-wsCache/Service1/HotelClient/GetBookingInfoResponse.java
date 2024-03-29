
package HotelClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="getBookingInfoResult" type="{http://schemas.datacontract.org/2004/07/HotelBookingService}ArrayOfBooked" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getBookingInfoResult"
})
@XmlRootElement(name = "getBookingInfoResponse")
public class GetBookingInfoResponse {

    @XmlElementRef(name = "getBookingInfoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBooked> getBookingInfoResult;

    /**
     * Gets the value of the getBookingInfoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBooked }{@code >}
     *     
     */
    public JAXBElement<ArrayOfBooked> getGetBookingInfoResult() {
        return getBookingInfoResult;
    }

    /**
     * Sets the value of the getBookingInfoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfBooked }{@code >}
     *     
     */
    public void setGetBookingInfoResult(JAXBElement<ArrayOfBooked> value) {
        this.getBookingInfoResult = value;
    }

}
