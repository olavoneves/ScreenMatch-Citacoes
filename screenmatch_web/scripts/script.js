import getDados from "./getDados.js";

const btnSortear = document.querySelector('.btn__sortear')
const fichaDescricao = document.getElementById('ficha__descricao')

function carregarInfoSerie() {
    getDados(`/series/frases`)
        .then(data => {
            fichaDescricao.innerHTML = `
                <img src="${data.poster}" alt="${data.titulo}"/>
                <div>
                    <h2>${data.titulo}</h2>
                    <div class="descricao__texto">
                        <p><i>"${data.frase}"</i></p>
                        <p><b>Citado por:</b>${data.personagem}</p>
                    </div>
                </div>
            `;
        })
        .catch(error => {
            console.error('Erro ao obter as informações da série: ', error)
        })
}

window.onload = carregarInfoSerie();
btnSortear.addEventListener('click', carregarInfoSerie);