package view;

import java.util.Scanner;

import controller.ItemController;
import controller.LoginController;
import models.Category;
import models.Item;
import models.Role;
import models.Unit;
import models.User;
import repository.ItemRepository;
import repository.UserRepository;
import service.ItemService;
import service.LoginService;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        // Repository
        
        UserRepository userRepository = new UserRepository();
        ItemRepository itemRepository = new ItemRepository();

        
        // Service
        
        LoginService loginService = new LoginService(userRepository);
        ItemService itemService = new ItemService(itemRepository);

        
        // Controller
        
        LoginController loginController = new LoginController(loginService);
        ItemController itemController = new ItemController(itemService);

        
        // Data Default
        
        Role role = new Role(1, "Admin");

        User admin = new User(
                1,
                "Administrator",
                "admin",
                "123",
                role);

        userRepository.save(admin);

        
        // Login
        
        System.out.println("===== LOGIN =====");

        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("Password : ");
        String password = input.nextLine();

        if (!loginController.login(username, password)) {
            System.out.println("Login Gagal!");
            input.close();
            return;
        }

        System.out.println("\nLogin Berhasil!");

        int pilihan;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Barang");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("ID Barang : ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama Barang : ");
                    String nama = input.nextLine();

                    System.out.print("Stock : ");
                    int stock = input.nextInt();

                    System.out.print("Harga Beli : ");
                    double hargaBeli = input.nextDouble();

                    System.out.print("Harga Jual : ");
                    double hargaJual = input.nextDouble();

                    Category category = new Category(1, "Makanan");
                    Unit unit = new Unit(1, "Pcs");

                    Item item = new Item(
                            id,
                            nama,
                            stock,
                            hargaBeli,
                            hargaJual,
                            category,
                            unit);

                    itemController.tambahItem(item);

                    System.out.println("Barang berhasil ditambahkan!");

                    break;

                case 2:

                    System.out.println("\n===== DAFTAR BARANG =====");

                    if (itemController.getAllItem().isEmpty()) {
                        System.out.println("Belum ada data barang.");
                    } else {

                        for (Item barang : itemController.getAllItem()) {

                            System.out.println("---------------------------");
                            System.out.println("ID          : " + barang.getId());
                            System.out.println("Nama Barang : " + barang.getItemName());
                            System.out.println("Stock       : " + barang.getStock());
                            System.out.println("Harga Beli  : " + barang.getPurchasePrice());
                            System.out.println("Harga Jual  : " + barang.getSellingPrice());
                            System.out.println("Kategori    : " + barang.getCategory().getCategoryName());
                            System.out.println("Unit        : " + barang.getUnit().getUnitName());

                        }

                    }

                    break;

                case 3:

                    System.out.println("Terima kasih.");
                    break;

                default:

                    System.out.println("Menu tidak tersedia.");

            }

        } while (pilihan != 3);

        input.close();

    }

}