#ejemplo de uso de repositorio

print("DATOS PERSONALES")
print("------------------")
vNom=input("ingrese su nombre")
while True:

    try:
        vEdad=int(input("ingrese su edad"))
    except:
        print("valor no corresponde ")      
    print("-----------------------..")
    print(f"su nombre es: {vNom}")
    print(f"su edad es: {vEdad}")

    print("programa finalizado")