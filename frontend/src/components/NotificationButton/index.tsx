import "./styles.css"
import icon from "../../assets/img/notification-icon.svg"
import axios from "axios";
import { BASE_URL } from "../../utils/request";


type Props = {
  saleId: number;
}
function NotificationButton({ saleId }: Props) {

  function handleClick(id: number) {

    axios(`${BASE_URL}/sales/notification`)
      .then(Response => {
        console.log('sucesso')
      })
  }

  return (

    <div className="dsmeta-red-btn" onClick={() => { handleClick(saleId) }}>

      <img src={icon} />
    </div>
  )
}

export default NotificationButton
