# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git
Configurar o nome de usuário e e-mail no git é obrigatório pois é através dele que é verificada a autoria dos commits realizados. Sem configurar essa opção o Git não permite que commits sejam executados, pois os mesmos ficariam sem identificação.

Para configurar o nome de usuário no git digite o código abaixo:

```bash
git config --global user.name DigiteSeuNome
```

Para configurar o e-mail no git digite o código abaixo:
```bash
git config --global user.email DigiteSeuEmail
```

### Criando Personal Access Token (PAT) no GitHub
Um
Personal Access Token (PAT) no GitHub é uma sequência de caracteres (uma "senha longa" gerada aleatoriamente) que funciona como um substituto seguro para a sua senha principal ao interagir com o GitHub via linha de comando (Git) ou APIs. Ele autentica o usuário com base em escopos de permissões específicos, em vez de dar acesso total à conta como a senha pessoal faria. 

Para criar o seu Personal Access Token siga os passos abaixo:

1. Abra o seu GitHub;
1. Clique no seu perfil e seleciona a opção "Settings";
1. Na esquerda vão existir várias opções, vá até a opção "Developer settings" (Ela é a ultima opção da lista);
1. Na esqueda clique na opção "Personal access tokens" e dps clique em "Tokens (classic)";
1. Clique em "Generate new token" e depois em "Generate new token (classic)";
1. Na opção "Note" coloque o nome que você deseja para seu PAT;
1. na Opção "Expiration" coloque o tempo que você deseja manter esse código ativo;
1. Após isso selecione a opção "Repo";
1. Por fim clique em "Generate token";
1. Na sua tela vai aparecer o código, copie ele para seu uso (Observação: esse código só aparecerá nesse momento, caso não salve ou guarde ele, será necessário gerar novamente o token).

### Salvar em cache as credenciais do PAT
Podemos salvar a nossa chave PAT em cache, essa opção é útil pois quando estamos utilizando o git na máquina e precisamos dar git push para o GitHub o git solicita o seu nome de usuário e a sua chave PAT, para evitar que tenhamos que colocar a chave a cada git push, podemos utilizar um comando para salvar as credenciais no cache do computador

Para salvar em cache a sua credencial PAT utilize o código abaixo:
```bash
git config --global credential.helper 'cache --timeout=3600'
```
obs: esse comando faz a credencial ficar salva no cache por 1 hora (3600 segundos) caso queira salvar por menos ou mais tempo, basta alterar o número.

Caso você queira deixar a credencial salva para sempre no seu pc, utilize o comando abaixo:

```bash
git config --global credential.helper store
```
Obs: Essa opção não é recomendada para pcs compartilhados por questão de segurança

## Qual a diferença entre git merge e git rebase?
