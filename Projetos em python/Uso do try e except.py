#Exemplo de bloco try/except em python

try:
  peso=float(input("Digite seu peso(em Kg):"))
  altura=float(input("Digite sua altura(em metros):"))
  imc=peso/altura**2
  print("Seu IMC é",imc,'Kg/m2')
except:
  print("Por favor,digite valores corretos")