# Calculadora-de-Passe
Esse sistema é uma calculadora de duração de crédito de passe de ônibus, que leva em consideração o perfil de consumo do usuário e o valor depositado. Ele foi desenvolvido em Java e funciona da seguinte forma:

Funcionamento do Sistema:
**Perfis de Consumo:**

O sistema reconhece dois perfis de usuários: Evelynn e Rafaella.
Cada perfil tem um padrão de uso de passagens diferente, dependendo do dia da semana.

**Entrada de Dados:**

O usuário informa seu nome (Evelynn ou Rafaella) e o valor depositado no passe.
O sistema valida se o nome inserido é válido e se o valor depositado está no formato correto.

**Cálculo de Duração:**

Com base no perfil selecionado, o sistema calcula quantos dias o crédito do passe durará, considerando:

O valor da passagem (R$ 5,40 inteira ou R$ 2,70 meia).
O número de passagens utilizadas por dia, que varia conforme o dia da semana.
O sistema avança dia a dia, subtraindo o valor gasto com passagens até que o saldo seja insuficiente para mais uma viagem.

**Resultado:**

O sistema retorna:

Até qual data o crédito do passe durará.
Se haverá saldo restante ou se faltará dinheiro no último dia.
