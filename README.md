# API de Cálculo de Distância e Rota
![java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

[![MIT license](https://img.shields.io/badge/License-MIT-blue.svg)](https://raw.githubusercontent.com/libdolf/DistanceCalculator/master/LICENSE)


Esta é uma API simples que permite calcular a distância entre dois pontos geográficos representados por suas coordenadas de latitude e longitude usando a fórmula Haversine. Além disso, a API gera um link para o Google Maps com a rota entre os dois pontos.

## Endpoint

### Cálculo de Distância e  Geração de Link do Google Maps
- **URL:** `/distance-calculator/v1/`
- **Método:** POST
- **Resposta:** A API retornará a distância em quilômetros entre os dois pontos  e um link para a rota no google mpas no formato JSON.


#### Exemplo de Requisição:
 ```json 
 {
  "location1": {
  "latitude": 9.68939636,
  "longitude": -43.89594305
    },
  "location2": {
  "latitude": -21.10516642,
  "longitude": -49.87348919
    }
  }
  ```
## Exemplo de Resposta
O endpoint retornará uma resposta no formato JSON, por exemplo:

```json
{
	"distance": 3485.921611497643,
	"mapsLink": "https://www.google.com/maps/dir/9.68939636,-43.89594305/-21.10516642,-49.87348919"
}
```
## Como Usar
- Clone o repositório:
```bash
git clone https://github.com/libdolf/DistanceCalculator.git
```
- Instale as dependências (se necessário) e inicie o servidor.

- Acesse os endpoints da API conforme descrito acima.


## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar solicitações de pull se encontrar melhorias ou correções.

## Licença
Este projeto está licenciado sob a Licença MIT - consulte o arquivo LICENSE para obter detalhes.

## Divirta-se calculando distâncias e planejando rotas! 😄
