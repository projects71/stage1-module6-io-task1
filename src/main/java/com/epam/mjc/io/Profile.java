package com.epam.mjc.io;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.util.Objects;

public class Profile {

    private String name;
    private Integer age;
    private String email;
    private Long phone;
    private File file;

    public Profile(File file) {
        this.file = file;

        try {
            readData();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Profile(String name, Integer age, String email, Long phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }



    public Long getPhone() {
        return phone;
    }



    public void readData() throws IOException {

        String s;
        String[] sts = new String[4];
        int i = 0;
        BufferedReader reader = new BufferedReader(new FileReader(file));


            while ((s = reader.readLine()) != null) {
                String line = s.split(":")[1];
                sts[i++] = line;

            }



        this.name = sts[0].substring(1);
        this.email = sts[2].substring(1);
        this.age = Integer.valueOf(sts[1].substring(1));
        this.phone = Long.valueOf(sts[3].substring(1));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Profile{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return getName().equals(profile.getName())
                && getAge().equals(profile.getAge())
                && getEmail().equals(profile.getEmail())
                && getPhone().equals(profile.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEmail(), getPhone());
    }
}
