import axios from "axios";
import React from "react";
import icon from "../../assets/img/notification-icon.svg";
import { BASE_URL } from "../Utils/Request";
import './styles.css';

type Props = {
    saleId: number;
}

const handleClick = (saleId: number) => {
    axios(`${BASE_URL}/sales/${saleId}/notification`)
        .then(response => {
            console.log("Sucesso");
        });
}

const NotificationButton = ({ saleId }: Props) => {
    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={icon} alt="Notificar" />
        </div>
    );
}

export default NotificationButton;