import math

def calcula(ang):
  ang=math.radians(ang)
  print("ângulo em radianos",ang)
  print("Seno",math.sin(ang))
  print("ângulo em radianos",math.cos(ang))
  print("ângulo em radianos",math.cos(ang))
  print("ângulo em radianos",math.tan(ang))

angulo=float(input("Digite o ângulo em graus:"))
calcula(angulo)