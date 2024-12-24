import { useState } from "react";
import Card from "../components/card";

export default function SearchScreen() {
  const [nomeLivro, setNomeLivro] = useState("");
  const [exibirResultado, setExibirResultado] = useState(false);


  async function handleSearch() {
    //pesquisar no backend

    setExibirResultado(true)
    alert("aaa")
    return nomeLivro;
  }


  function renderizarPesquisa() {
    return (
      <div className="lg:m-2 background:blue w-screen h-screen justify-center items-center content-center flex">
        <input type="text" onChange={(e) => setNomeLivro(e.target.value)} />
        <button onClick={() => handleSearch()}>Procurar</button>
      </div>
    )
  }

  function exibirResultados() {
    return (
      <div className="lg:m-2 background:blue w-screen h-screen justify-center items-center content-center flex">
       <Card/>
      </div>
    )
  }


  return (
    !exibirResultado ? renderizarPesquisa() : exibirResultados()
  );
}
