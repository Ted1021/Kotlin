package chap5.section06

/**
 * [연관관계]
 * 서로 분리된 두개의 클래스가 관계를 가지는것
 * 서로의 기능수행을 위해 참조를 하고 있을 뿐,
 * 두 클래스 모두 서로의 생명주기에 영향을 받지 않는다.
 */
fun main() {
    val doc1 = Doctor("TED")
    val patient1 = Patient("Alice")

    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}

class Patient(val name: String) {
    fun doctorList(d: Doctor) {
        println("Patient: $name, Doctor:${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) {
        println("Doctor: $name, Patient:${p.name}")
    }
}