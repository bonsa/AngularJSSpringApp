package angularspringapp.model;

public class MathResponse
{
    private String  text;
    private Integer number;
    private Boolean found;
    private String  type;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

    public Boolean getFound()
    {
        return found;
    }

    public void setFound(Boolean found)
    {
        this.found = found;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((found == null) ? 0 : found.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MathResponse other = (MathResponse) obj;
        if (found == null)
        {
            if (other.found != null) return false;
        }
        else if (!found.equals(other.found)) return false;
        if (number == null)
        {
            if (other.number != null) return false;
        }
        else if (!number.equals(other.number)) return false;
        if (text == null)
        {
            if (other.text != null) return false;
        }
        else if (!text.equals(other.text)) return false;
        if (type == null)
        {
            if (other.type != null) return false;
        }
        else if (!type.equals(other.type)) return false;
        return true;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("MathResponse [text=");
        builder.append(text);
        builder.append(", number=");
        builder.append(number);
        builder.append(", found=");
        builder.append(found);
        builder.append(", type=");
        builder.append(type);
        builder.append("]");
        return builder.toString();
    }

}
