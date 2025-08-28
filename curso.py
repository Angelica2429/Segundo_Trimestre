estudiantes1=["Daniel","Luis","Andrea","Bella","Karen"]
estudiantes2=["Natalia","María","Lauren","Sara","Sofia"]
estudiantes3=["Natalia","Karen","Juan","Manuel"]
print("-----------------------------Curso----------------------------------")
class curso:
    def __init__(self,nombre,codigo,profesor,estudiantes):
        self.nombre=nombre
        self.codigo=codigo
        self.profesor=profesor
        self.estudiantes=estudiantes
    def mostrar_info(self):
        print(f"El nombre del curso es:{self.nombre}")
        print(f"El codigo del curso es:{self.codigo}")
        print(f"El nombre del profesor es:{self.profesor}")
        print(f"Los estudiantes del curso son:{self.estudiantes}")
curso1= curso ("Ingles","001","Jorge Moná",estudiantes1)
curso2= curso ("Sociales","003","Adriana Marin",estudiantes2)
curso3= curso ("Arte","002","Yepez",estudiantes3)

curso1.mostrar_info()
print("--------------------------------------")
curso2.mostrar_info()
print("--------------------------------------")
curso3.mostrar_info()

print("-----------------------------Curso presencial----------------------------------")

class curso_presencial(curso):
    def __init__(self, nombre, codigo, profesor, estudiantes, salon):
        super().__init__(nombre, codigo, profesor, estudiantes)
        self.salon = salon
    def mostrar_info(self):
        print(f"El nombre del curso presencial es:{self.nombre}")
        print(f"El codigo del curso presencial es:{self.codigo}")
        print(f"El nombre del profesor es:{self.profesor}")
        print(f"Los estudiantes del curso presencial son:{self.estudiantes}")
        print(f"El número de salón del curso es:{self.salon}")
curso4= curso_presencial ("Matematicas","1121","Reinel","Luisa,isabella,David,Juan","12")
curso4.mostrar_info()
print("-----------------------------Curso Online----------------------------------")
class curso_Online(curso):
    def __init__(self, nombre, codigo, profesor, estudiantes,plataforma):
        super().__init__(nombre, codigo, profesor, estudiantes)
        self.plataforma = plataforma
    def mostrar_info(self):
        print(f"El nombre del curso online es:{self.nombre}")
        print(f"El codigo del curso online es:{self.codigo}")
        print(f"El nombre del profesor es:{self.profesor}")
        print(f"Los estudiantes del curso online son:{self.estudiantes}")
        print(f"La plataforma del curso es:{self.plataforma}")
curso5= curso_Online ("Tecnologia","1001","Octavio","Luis,Nicol,Camila,Justin","Google meet")
curso5.mostrar_info()
print("-----------------------------Estudiantes----------------------------------")
class Estudiantes:
    def __init__(self,nombre,id_estudiante,fecha_de_nacimiento):
        self.nombre=nombre
        self.id_estudiante=id_estudiante
        self.fecha_de_nacimiento=fecha_de_nacimiento

    def mostrar_info(self):
        print(f"El nombre del estudiante es:{self.nombre}")
        print(f"El id del estudiante es:{self.id_estudiante}")
        print(f"La fecha de nacimiento es:{self.fecha_de_nacimiento}")
estudiante1= Estudiantes ("Daniel","1114","2000-07-10")
estudiante2= Estudiantes ("Karen","1103","2007-9-16")
estudiante3= Estudiantes ("Natalia","1102","2008-05-25")

estudiante1.mostrar_info()
print("--------------------------------------")
estudiante2.mostrar_info()
print("--------------------------------------")
estudiante3.mostrar_info()
print("--------------------------------------")
print("-----------------------------Profesores----------------------------------")
class Profesores:
    def __init__(self,nombre,id_profesor,fecha_de_nacimiento,materia):
        self.nombre=nombre
        self.id_profesor=id_profesor
        self.fecha_de_nacimiento=fecha_de_nacimiento
        self.materia=materia

    def mostrar_info(self):
        print(f"El nombre del profesor es:{self.nombre}")
        print(f"El id del profesor es:{self.id_profesor}")
        print(f"La fecha de nacimiento es:{self.fecha_de_nacimiento}")
        print(f"Materia que enseña:{self.materia}")
profesor1= Profesores ("Jorge moná","2222","1972-06-20","Ingles")
profesor2= Profesores ("Adriana Marin","2223","1981-02-10","Sociales")
profesor3= Profesores ("Yepez","2233","1971-07-20","Arte")

profesor1.mostrar_info()
print("--------------------------------------")
profesor2.mostrar_info()
print("--------------------------------------")
profesor3.mostrar_info()
print("--------------------------------------")