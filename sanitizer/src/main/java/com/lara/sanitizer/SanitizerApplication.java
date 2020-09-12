package com.lara.sanitizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lara.sanitizer.customer.entity.Customer;
import com.lara.sanitizer.customer.entity.CustomerOrder;
import com.lara.sanitizer.customer.entity.OrderAddress;
import com.lara.sanitizer.customer.entity.OrderItems;
import com.lara.sanitizer.customer.repository.CustomerOrderRepository;
import com.lara.sanitizer.customer.repository.CustomerRepository;
import com.lara.sanitizer.product.entity.AvailableStock;
import com.lara.sanitizer.product.entity.Category;
import com.lara.sanitizer.product.entity.Ingredient;
import com.lara.sanitizer.product.entity.Manufacturer;
import com.lara.sanitizer.product.entity.Offers;
import com.lara.sanitizer.product.entity.Product;
import com.lara.sanitizer.product.entity.ProductType;
import com.lara.sanitizer.product.entity.Refund;
import com.lara.sanitizer.product.entity.RefundTx;
import com.lara.sanitizer.product.entity.ReviewsRatings;
import com.lara.sanitizer.product.entity.SupplierProduct;
import com.lara.sanitizer.product.entity.SupplierProductIngredient;
import com.lara.sanitizer.product.repository.AvailableStockRepository;
import com.lara.sanitizer.product.repository.CategoryRepository;
import com.lara.sanitizer.product.repository.IngredientRepository;
import com.lara.sanitizer.product.repository.ManufacturerRepository;
import com.lara.sanitizer.product.repository.OffersRepository;
import com.lara.sanitizer.product.repository.ProductRepository;
import com.lara.sanitizer.product.repository.ProductTypeRepository;
import com.lara.sanitizer.product.repository.RefundRepository;
import com.lara.sanitizer.product.repository.RefundTxRepository;
import com.lara.sanitizer.product.repository.ReviewsRatingsRepository;
import com.lara.sanitizer.product.repository.SupplierProductIngredientRepository;
import com.lara.sanitizer.product.repository.SupplierProductRepository;
import com.lara.sanitizer.supplier.entity.Address;
import com.lara.sanitizer.supplier.entity.Document;
import com.lara.sanitizer.supplier.entity.LoginDetails;
import com.lara.sanitizer.supplier.entity.Supplier;
import com.lara.sanitizer.supplier.entity.SupplierBankAcInfo;
import com.lara.sanitizer.supplier.entity.SupplierCertificate;
import com.lara.sanitizer.supplier.entity.SupplierContactPerson;
import com.lara.sanitizer.supplier.entity.SupplierOwner;
import com.lara.sanitizer.supplier.repository.AddressRepository;
import com.lara.sanitizer.supplier.repository.DocumentRepository;
import com.lara.sanitizer.supplier.repository.LoginDetailsRepository;
import com.lara.sanitizer.supplier.repository.SupplierBankAcInfoRepository;
import com.lara.sanitizer.supplier.repository.SupplierCertificateRepository;
import com.lara.sanitizer.supplier.repository.SupplierContactPersonRepository;
import com.lara.sanitizer.supplier.repository.SupplierOwnerRepository;
import com.lara.sanitizer.supplier.repository.SupplierRepository;


@SpringBootApplication
public class SanitizerApplication implements CommandLineRunner {
	
	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private CustomerOrderRepository orderRepo;
	
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private LoginDetailsRepository loginDetailsRepo;
	
	@Autowired
	private SupplierOwnerRepository supplierOwnerRepo;
	
	@Autowired
	private SupplierContactPersonRepository supplierContactPersonRepo;
	
	@Autowired
	private SupplierCertificateRepository supplierCertificateRepo;
	
	@Autowired
	private SupplierBankAcInfoRepository supplierBankAcInfoRepo;
	
	@Autowired
	private DocumentRepository documentRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Autowired
	private ProductTypeRepository productTypeRepo;
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ManufacturerRepository manufacturerRepo;
	
	@Autowired
	private SupplierRepository supplierRepo;
	
	@Autowired
	private SupplierProductRepository supplierProductRepo;
	
	@Autowired
	private IngredientRepository ingredientRepo;
	
	@Autowired
    private SupplierProductIngredientRepository supplierProductIngredientRepo;
	
	@Autowired
	private AvailableStockRepository availableStockRepo;
	
	@Autowired
	private OffersRepository offersRepo;
	
	@Autowired
	private ReviewsRatingsRepository reviewsRatingsRepo;
	
	@Autowired
	private RefundRepository refundRepo;
	
	@Autowired
	private RefundTxRepository refundTxRepo;
	
	

	public static void main(String[] args) {
		SpringApplication.run(SanitizerApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		// Supplier
		Supplier s1=new Supplier();
		s1.setCompanyName("AKM COMP");
		s1.setWebUrl("Akm.com");
		s1.setLandlineNumber(6201357410L);
		
		Supplier s2=new Supplier();
		s2.setCompanyName("ANK LTD");
		s2.setWebUrl("Ank.com");
		s2.setLandlineNumber(4588665L);
		
//		supplierRepo.save(s1);   // save Only Supplier for Child Operation
//		supplierRepo.save(s2);
		
		LoginDetails lo1=new LoginDetails();
		lo1.setUsername("akm@gmail.com");
		lo1.setPassword("124563");
		lo1.setRole("SUPPLIER");
		lo1.setSupplier(s1);
		
//		loginDetailsRepo.save(lo1);   //save with child (loginDetails)
//		
//		lo1.setUsername("Any");     //set value for update
//		lo1.setSupplier(s2);
//		loginDetailsRepo.save(lo1); //update login
//		
//		//read login BY id start
//		LoginDetails lr=loginDetailsRepo.findById(1).get();
//		System.out.println(lr.getUsername());
//		System.out.println(lr.getSupplier().getCompanyName());
//		//read login BY id end
//		
//		loginDetailsRepo.deleteById(1);  //delete login By Id
		
		
		
		
		Address a1=new Address();
		a1.setLane1("Rmnathpur");
		a1.setLane2("Chhatauna");
		a1.setDistrict("Samastipur");
		a1.setState("Bihar"); 
		a1.setCountry("India");
		a1.setPinCode("560029");
		a1.setSupplier(s1);
		
//		addressRepo.save(a1);       // save (address)
//		
//		a1.setLane1("Samastipur");  //set value for update
//		a1.setSupplier(s2);         //set supplier for update
//		addressRepo.save(a1);       //update
//		
//		Address ar=addressRepo.findById(1).get();  //read AddressBy Id
//		System.out.println(ar.getLane1());
//		System.out.println(ar.getSupplier().getCompanyName());
//		
//		addressRepo.deleteById(1);  //delete addressBy Id
		
		SupplierOwner so1=new SupplierOwner();
		so1.setFirstName("Aashish");
		so1.setLastName("Jamwal");
		so1.setEmail("aashisht@gmail.com");
		so1.setMobile(9430866085L);
		so1.setDegination("CEO");
		so1.setSupplier(s1);
		
		SupplierOwner so2=new SupplierOwner();
		so2.setFirstName("Suresh");
		so2.setLastName("Andhra");
		so2.setEmail("Suresh@gmail.com");
		so2.setMobile(9430866085L);
		so2.setDegination("CEO");
		so2.setSupplier(s1);
		
//		supplierOwnerRepo.saveAll(Arrays.asList(so1,so2));    //save (supplierOwner)
//		
//		so1.setFirstName("AASHISH"); //set value for update
//		so1.setSupplier(s2);         //set supplier for update
//		
//		SupplierOwner sor=supplierOwnerRepo.findById(1).get();  //read supplier Owner
//		System.out.println(sor.getFirstName());
//		System.out.println(sor.getSupplier().getCompanyName());
//		
//		supplierOwnerRepo.deleteById(1);
		
		
		
		SupplierContactPerson scp1=new SupplierContactPerson();
		scp1.setFirstName("Chetan");
		scp1.setLastName("Karwa");
		scp1.setDegination("Staff");
		scp1.setMobile(789654123L);
		scp1.setEmpId("ABC123");
		scp1.setEmail("chetan@gmail.com");
		scp1.setSupplier(s1);
		
		SupplierContactPerson scp2=new SupplierContactPerson();
		scp2.setFirstName("Sayed");
		scp2.setLastName("Umar");
		scp2.setDegination("Staff");
		scp2.setMobile(896547851L);
		scp2.setEmpId("PQR123");
		scp2.setEmail("Sayed@gmail.com");
		scp2.setSupplier(s1);
		
//		supplierContactPersonRepo.saveAll(Arrays.asList(scp1,scp2));  //save (supplierContactPerson)
		
		SupplierBankAcInfo sbai1=new SupplierBankAcInfo();
		sbai1.setAccountName("Saveing");
		sbai1.setAccountNumber(78965456611L);
		sbai1.setIfscCode("SBID4970");
		sbai1.setBankName("SBI");
		sbai1.setSupplier(s1);
		
		SupplierBankAcInfo sbai2=new SupplierBankAcInfo();
		sbai2.setAccountName("Current");
		sbai2.setAccountNumber(199700115555L);
		sbai2.setIfscCode("BKID4970");
		sbai2.setBankName("BIO");
		sbai2.setSupplier(s1);
		
//		supplierBankAcInfoRepo.saveAll(Arrays.asList(sbai1,sbai2));  //save (SupplierBankAcInfo)
		
		SupplierCertificate sc1=new SupplierCertificate();
		sc1.setCertificateName("ABC");
		sc1.setDescription("This is acivements");
		sc1.setImageUrl("dfghj");
		sc1.setIssuedBy("BSNL");
		sc1.setSupplier(s1);
		
		SupplierCertificate sc2=new SupplierCertificate();
		sc2.setCertificateName("Any");
		sc2.setDescription("This is BIG");
		sc2.setImageUrl("iuygvbnm");
		sc2.setIssuedBy("Airtel");
		sc2.setSupplier(s1);
		
		
//		supplierCertificateRepo.saveAll(Arrays.asList(sc1,sc2));   //save (supplierCertificste)
		
		Document d1=new Document();
		d1.setDocumentName("AadharCard");
		d1.setDocumentDescription("12345678952546");
		d1.setImageUrl("esdfghj");
		d1.setSupplier(s1);
		
		Document d2=new Document();
		d2.setDocumentName("PAN CARD");
		d2.setDocumentDescription("DPAK4970R");
		d2.setImageUrl("BVUKHJ");
		d2.setSupplier(s1);
		
//		documentRepo.saveAll(Arrays.asList(d1,d2));    //save (document)
		
		//Save All With parent start
		s1.setLoginDetails(lo1);
		s1.setAddress(a1);
		s1.setSupplierOwner(Arrays.asList(so1,so2));
		s1.setSupplierContactPerson(Arrays.asList(scp1,scp2));
		s1.setSupplierBankAcInfo(Arrays.asList(sbai1,sbai2));
		s1.setSupplierCertificate(Arrays.asList(sc1,sc2));
		s1.setDocument(Arrays.asList(d1,d2));

		supplierRepo.save(s1);    //Save With Parent with (cascade = CascadeType.ALL)
		//Save All With parent end
		

		// update with parent start
		s1.setCompanyName("abcd");          // set value for Update
		a1.setLane1("Patna");		        // set value for Update 
		d1.setDocumentName("VoterID");      // set value for Update
		
		supplierRepo.save(s1);   //update with parent with (cascade = CascadeType.ALL)
		// update with parent end
		
		//read All with parent Start
		List<Supplier> sr= (List<Supplier>) supplierRepo.findAll();   //readAll  with parent. afer adding (spring.jpa.properties.hibernate.enable_lazy_load_no_trans=true) this code in properties file. also work in rest api without adding code. 
		for(Supplier s: sr) {
			System.out.print(s.getCompanyName()+"\t");
			System.out.print(s.getWebUrl()+"\t");
			System.out.println(s.getLandlineNumber());
			
			System.out.print(s.getLoginDetails().getUsername()+"\t");
			System.out.println(s.getLoginDetails().getPassword());
			
			System.out.print(s.getAddress().getLane1()+"\t");
			System.out.print(s.getAddress().getLane2()+"\t");
			System.out.print(s.getAddress().getDistrict()+"\t");
			System.out.print(s.getAddress().getState()+"\t");
			System.out.print(s.getAddress().getCountry()+"\t");
			System.out.println(s.getAddress().getPinCode()+"\t");
		
			for(SupplierOwner so:s.getSupplierOwner()) {
				System.out.print(so.getFirstName()+"\t");
				System.out.println(so.getLastName());
			}
			
			for(SupplierContactPerson scp:s.getSupplierContactPerson()) {
				System.out.print(scp.getFirstName()+"\t");
				System.out.println(scp.getLastName());
			}
			
			for(SupplierCertificate sc:s.getSupplierCertificate()) {
				System.out.print(sc.getCertificateName()+"\t");
				System.out.println(sc.getDescription());
			}
			for(SupplierBankAcInfo sbai:s.getSupplierBankAcInfo()) {
				System.out.print(sbai.getAccountName()+"\t");
				System.out.println(sbai.getBankName());
			}
			for(Document d:s.getDocument()) {
				System.out.print(d.getDocumentName()+"\t");
				System.out.println(d.getDocumentDescription());
			}
		}	
		//read All with parent end
		
		
		//supplierRepo.deleteById(1);    //deleteById with parent with (cascade = CascadeType.ALL)
		
		//supplierRepo.deleteAll();    //deleteAll with parent with (cascade = CascadeType.ALL)
		
		
		
		
		
		
		// Product
		
		// save or insert
        Category cat1 = new Category();
        cat1.setId(201);
        cat1.setName("category1");
        cat1.setCategoryDesc("cat1desc");
//        Category cat2 = new Category();
//        cat2.setId(202);
//        cat2.setName("category2");
//        cat2.setCategoryDesc("cat 2 desc");
//        
//        categoryRepo.saveAll(Arrays.asList(cat1, cat2));
        
        
        ProductType pro1 = new ProductType();
        pro1.setId(301);
        pro1.setName("producttype1");
        pro1.setProductTypeDesc("prodesc1");
        pro1.setCategory(cat1);
        
        ProductType pro2 = new ProductType();
        pro2.setId(302);
        pro2.setName("producttype2");
        pro2.setProductTypeDesc("prodesc2");
        pro2.setCategory(cat1);
        
        
        cat1.setProductTypes(Arrays.asList(pro1, pro2));
        
        
        //productTypeRepo.saveAll(Arrays.asList(pro1, pro2));
        
        categoryRepo.save(cat1);
        
        // readAll
        /*
        ProductType obj = productTypeRepo.findById(301).get();
		System.out.println(obj.getName());
		System.out.println(obj.getProductTypeDesc());
		System.out.println(obj.getCategory().getName());
		*/
        
        /* delete
        productTypeRepo.deleteById(301);
     	productTypeRepo.delete(pro1);     
        productTypeRepo.deleteAll();
        */
        
        /* update
		//cat1.setCategoryDesc("cat1desc1111");
		pro1.setProductTypeDesc("prodesc1111");
		productTypeRepo.save(pro1);
		*/
		
        
        Product prod1 = new Product();
        prod1.setId(401);
        prod1.setName("product1");
        prod1.setProductDesc("productdesc1");
        prod1.setProductType(pro1);
       
        Product prod2 = new Product();
        prod2.setId(402);
        prod2.setName("product2");
        prod2.setProductDesc("productdesc2");
        prod2.setProductType(pro1);
        
        pro1.setProduct(Arrays.asList(prod1, prod2));
        
        productTypeRepo.save(pro1);
        
        /* readAll
        Product obj = productRepo.findById(401).get();
		System.out.println(obj.getName());
		System.out.println(obj.getProductDesc());
		System.out.println(obj.getProductType().getName());
        */
        
        // delete
        //productRepo.deleteById(401);
     	//productRepo.delete(prod1);     
        //productRepo.deleteAll();
        
        // update
        /*
		prod1.setName("prodct222");
		productRepo.save(prod1);
		*/
        
        
        Manufacturer man1 = new Manufacturer();
        man1.setId(501);
        man1.setName("manufacturer1");
        man1.setAddress("address1");
        
        /*
        Manufacturer man2 = new Manufacturer();
        man2.setId(502);
        man2.setName("manufacturer2");
        man2.setAddress("address2");
        */
        
//        Supplier s3 = new Supplier();
//        s3.setId(1001);
//        s3.setCompanyName("com1");
//        s3.setAddress("address1");
//        s3.setWebSiteUrl("www.com1.com");
//        s3.setLandlineNumber(90194);       
        
        SupplierProduct sp1 = new SupplierProduct();
        sp1.setId(601);
        sp1.setPrice(22.5);
        sp1.setProductImgUrl("url1...");
        sp1.setSize(15);
        sp1.setManufactureDate("23-05-2020");
        sp1.setExpiryDate("30-05-2020");
        sp1.setNoOfDaysToDeliver(7);
        sp1.setHandleWithCare("use sanitizer");
        sp1.setCommisionPercentage(4.3F);
        //sp1.setManufacturer(man1);
        //sp1.setProduct(prod1);
        sp1.setSupplier(s1); // Using Supplier class of Supplier Module
        
        SupplierProduct sp2 = new SupplierProduct();
        sp2.setId(602);
        sp2.setPrice(25.5);
        sp2.setProductImgUrl("url2...");
        sp2.setSize(18);
        sp2.setManufactureDate("23-04-2020");
        sp2.setExpiryDate("30-04-2020");
        sp2.setNoOfDaysToDeliver(5);
        sp2.setHandleWithCare("use sanitizer");
        sp2.setCommisionPercentage(4.6F);
        //sp2.setManufacturer(man1);
        //sp2.setProduct(prod1);
        sp2.setSupplier(s1);
        
        s1.setSupplierProducts(Arrays.asList(sp1, sp2));
        
        supplierRepo.save(s1);
        
        //man1.setSupplierProducts(Arrays.asList(sp1, sp2));
        
        manufacturerRepo.save(man1);
        
        //prod1.setSupplierProducts(Arrays.asList(sp1, sp2));
        
        productRepo.save(prod1);
        
        
        /* these are with manufacturer and SupplierProduct
        // readAll
        SupplierProduct obj = supplierProductRepo.findById(601).get();
		System.out.println(obj.getPrice());
		System.out.println(obj.getHandleWithCare());
		System.out.println(obj.getManufacturer().getName());
        */
        
        // delete
        // supplierProductRepo.deleteById(601);
        // supplierProductRepo.delete(sp1);     
        // supplierProductRepo.deleteAll();
        
        // update
        /*
        sp1.setHandleWithCare("use sanitizer1234");
        supplierProductRepo.save(sp1);
		*/
        
        // these are with Product and SupplierProduct
        // readAll
        /*
        SupplierProduct obj = supplierProductRepo.findById(601).get();
		System.out.println(obj.getPrice());
		System.out.println(obj.getHandleWithCare());
		System.out.println(obj.getProduct().getName());
        */
        
        // delete
        // supplierProductRepo.deleteById(601);
        // supplierProductRepo.delete(sp1);     
        // supplierProductRepo.deleteAll();
        
        // update
        /*
        sp1.setHandleWithCare("use sanitizer456");
        supplierProductRepo.save(sp1);
		*/
        
        // these are with Supplier and SupplierProduct
        // readAll
        /*
        SupplierProduct obj = supplierProductRepo.findById(601).get();
		System.out.println(obj.getPrice());
		System.out.println(obj.getHandleWithCare());
		System.out.println(obj.getSupplier().getCompanyName());
        */
        
        // delete
        // supplierProductRepo.deleteById(601);
        // supplierProductRepo.delete(sp1);     
        // supplierProductRepo.deleteAll();
        
        // update
        /*
        sp1.setHandleWithCare("use sanitizer789");
        supplierProductRepo.save(sp1);
		*/
        
        Ingredient in1 = new Ingredient();
		in1.setId(101);
		in1.setName("ethanol");
		in1.setIngreDesc("IngreDesc1");
		Ingredient in2 = new Ingredient();
		in2.setId(102);
		in2.setName("Glycerol");
		in2.setIngreDesc("IngreDesc2");
		Ingredient in3 = new Ingredient();
		in3.setId(103);
		in3.setName("isopropyl");
		in3.setIngreDesc("IngreDesc3");
		
		SupplierProductIngredient spi1 = new SupplierProductIngredient();
		spi1.setId(1104);
		spi1.setPercentage(96);
		spi1.setSupplierProduct(sp1);
		
        SupplierProductIngredient spi2 = new SupplierProductIngredient();
        spi2.setId(1105);
        spi2.setPercentage(98);
        spi2.setSupplierProduct(sp1);
        
        SupplierProductIngredient spi3 = new SupplierProductIngredient();
        spi3.setId(1106);
        spi3.setPercentage(97);
        spi3.setSupplierProduct(sp1);
        
        
        in1.setSupplierProductIngredient(Arrays.asList(spi1,spi2,spi3));
		ingredientRepo.save(in1); // setting setSupplierProductIngredients to ingredient and saving
		in2.setSupplierProductIngredient(Arrays.asList(spi1,spi2));
		ingredientRepo.save(in2);
		in3.setSupplierProductIngredient(Arrays.asList(spi1,spi3));
		ingredientRepo.save(in3);
		
		// readAll with Ingredient and SupplierProductIngredient
//		Ingredient obj = ingredientRepo.findById(101).get();
//		System.out.println(obj.getName());
//		System.out.println(obj.getSupplierProductIngredient());
		
//		SupplierProductIngredient obj1 = supplierProductIngredientRepo.findById(1104).get();
//		System.out.println(obj1.getPercentage());
//		System.out.println(obj1.getIngredient());
		
		//in1.setSupplierProductIngredient(Arrays.asList(spi1));
		//ingredientRepo.save(in1);
		
		
		//studentRepo.deleteById(102);
		
		// SupplierProduct and SupplierProductIngredient
		// readAll
		/*
		SupplierProductIngredient obj = supplierProductIngredientRepo.findById(1104).get();
		System.out.println(obj.getPercentage());
		System.out.println(obj.getSupplierProduct().getPrice());
        */
        
        // delete
        // supplierProductIngredientRepo.deleteById(1104);
     	// supplierProductIngredientRepo.delete(spi1);     
        // supplierProductIngredientRepo.deleteAll();
        
        // update
        /*
		spi1.setPercentage(92);
		supplierProductIngredientRepo.save(spi1);
		*/
		
        
        AvailableStock as1 = new AvailableStock();
        as1.setId(2201);
        as1.setQuantity(100);
		as1.setSupplierProduct(sp1);
		
		AvailableStock as2 = new AvailableStock();
        as2.setId(2202);
        as2.setQuantity(50);
		as2.setSupplierProduct(sp1);
		
		sp1.setAvailableStocks(Arrays.asList(as1, as2));
		
		supplierProductRepo.save(sp1);
		
		 // readAll
		/*
		AvailableStock obj = availableStockRepo.findById(2201).get();
		System.out.println(obj.getQuantity());
		System.out.println(obj.getSupplierProduct().getPrice());
        */
        
        // delete
		// availableStockRepo.deleteById(2201);
     	// availableStockRepo.delete(as1);     
        // availableStockRepo.deleteAll();
        
        // update
        /*
		as1.setQuantity(250);
		availableStockRepo.save(as1);
		*/
		
		
		Offers of1 = new Offers();
		of1.setId(20001);
		of1.setOfferStartDate("12-04-2020");
		of1.setOfferEndDate("25-04-2020");
		of1.setOfferPercentage(10.0F);
		of1.setSupplierProduct(sp1);
		
		Offers of2 = new Offers();
		of2.setId(20002);
		of2.setOfferStartDate("15-04-2020");
		of2.setOfferEndDate("30-04-2020");
		of2.setOfferPercentage(14.0F);
		of2.setSupplierProduct(sp1);
		
		sp1.setOffers(Arrays.asList(of1, of2));
		supplierProductRepo.save(sp1);
		

		// readAll
		/*
		Offers obj = offersRepo.findById(20001).get();
		System.out.println(obj.getOfferPercentage());
		System.out.println(obj.getSupplierProduct().getPrice());
       */
       
       // delete
		// offersRepo.deleteById(20001);
		// offersRepo.delete(of1);     
		// offersRepo.deleteAll();
       
       // update
       /*
		of1.setOfferPercentage(16.0F);
		offersRepo.save(of1);
		*/		
		
		
		ReviewsRatings rr1 = new ReviewsRatings();
		rr1.setId(30001);
		rr1.setRatingNumber(3);
		rr1.setReviewComment("good");
		rr1.setDeliveryImage("img1");
		rr1.setSupplierProduct(sp1);
		
		ReviewsRatings rr2 = new ReviewsRatings();
		rr2.setId(30002);
		rr2.setRatingNumber(4);
		rr2.setReviewComment("good");
		rr2.setDeliveryImage("img2");
		rr2.setSupplierProduct(sp1);
		
		sp1.setReviewsRatings(Arrays.asList(rr1, rr2));
		supplierProductRepo.save(sp1);
		

		// readAll
		/*
		ReviewsRatings obj = reviewsRatingsRepo.findById(30001).get();
		System.out.println(obj.getReviewComment());
		System.out.println(obj.getSupplierProduct().getPrice());
       */
       
       // delete
		// reviewsRatingsRepo.deleteById(30001);
		// reviewsRatingsRepo.delete(rr1);     
		// reviewsRatingsRepo.deleteAll();
       
       // update
       /*
		rr1.setReviewComment("good product");
		reviewsRatingsRepo.save(rr1);
		*/
		
		Refund ref1 = new Refund();
		ref1.setId(40001);
		ref1.setProductReturnPeriod(10);
		ref1.setRefundPolicies("refpoliciy1");
		ref1.setMoneyRefundPeriod(7);
		ref1.setSupplierProduct(sp1);
		
		Refund ref2 = new Refund();
		ref2.setId(40002);
		ref2.setProductReturnPeriod(12);
		ref2.setRefundPolicies("refpoliciy2");
		ref2.setMoneyRefundPeriod(8);
		ref2.setSupplierProduct(sp1);
		
		sp1.setRefund(Arrays.asList(ref1, ref2));
		
		supplierProductRepo.save(sp1);
		
		// readAll
		/*
		Refund obj = refundRepo.findById(40001).get();
		System.out.println(obj.getRefundPolicies());
		System.out.println(obj.getSupplierProduct().getPrice());
       */
       
       // delete
		// refundRepo.deleteById(40001);
		// refundRepo.delete(ref1);     
		// refundRepo.deleteAll();
       
       // update
       /*
		ref1.setReviewComment("good product");
		refundRepo.save(ref1);
		*/
		
		RefundTx rt1 = new RefundTx();
		rt1.setId(50001);
		rt1.setRefundQuantity(4);
		//rt1.setOrder(101); // dependent on Customer module or order table
		//rt1.setCustomer(201); //dependent on Customer module or customer table
		rt1.setSupplierProduct(sp1);
			
		RefundTx rt2 = new RefundTx();
		rt2.setId(50002);
		rt2.setRefundQuantity(6);
		//rt2.setOrder(101); // dependent on Customer module or order table
		//rt2.setCustomer(201); // dependent on Customer module or customer table
		rt2.setSupplierProduct(sp1);
			
		sp1.setRefundTx(Arrays.asList(rt1, rt2));
			
		supplierProductRepo.save(sp1);
			
		// readAll
		/*
		RefundTx obj = refundTxRepo.findById(50001).get();
		System.out.println(obj.getRefundQuantity());
		System.out.println(obj.getSupplierProduct().getPrice());
	    */
	       
	    // delete
		// refundTxRepo.deleteById(50001);
		// refundTxRepo.delete(rt1);     
		// refundTxRepo.deleteAll();
	       
	    // update
	    /*
		rt1.setRefundQuantity(14);
		refundTxRepo.save(rt1);
		*/
		
		
		
		
		// Customer 
		// Creating Customer Object
		Customer customer = new Customer();
		customer.setId(101);
		customer.setFirstName("Deep");
		customer.setLastName("Shukla");
		customer.setEmail("deep@gmail.com");
		customer.setMobileNo("7066764437");
		customer.setPassword("1234");
	
		// Creating CustomerOrder object
		CustomerOrder custOrder = new CustomerOrder();
		custOrder.setOrderStatus(Util.status.DELIVERED);
		custOrder.setOrderDate(Util.generateDate());
		custOrder.setCustomer(customer);
			
		// Creating OrderAddress Object
	    OrderAddress add1 = new OrderAddress();
	    add1.setFullName("Deep Shukla");
	    add1.setCityName("Bangalore");
	    add1.setHouseNo("123");
	    add1.setLandmark("Near T Park");
	    add1.setMobileNumber("7066884437");
	    add1.setPincode(560068);
	    add1.setState("Karnataka");
	    add1.setStreet("17th main");
	    add1.setCustomerOrder(custOrder);
		   
	    // Creating OrderItems Object
	    OrderItems items = new OrderItems();
	    items.setCustomerOrder(custOrder);
	    items.setQuantity(100);
	
	    List<OrderItems> list = new ArrayList<OrderItems>();
		list.add(items);
		
		custOrder.setOrderAddress(add1);
	    custOrder.setOrderItems(list);
	
	    // Saving customer
	    customerRepo.saveAll(Arrays.asList(customer));
	    //Saving CustomerOrder Object
		orderRepo.save(custOrder);
			
			 	 
	    
	    // Reading Customer Data
//				List<Customer> c1 = (List<Customer>) customerRepo.findAll();
//				System.out.println(c1);
		
	    // Reading CustomerOrder Data
//				List<CustomerOrder> o1 = (List<CustomerOrder>) orderRepo.findAll();
//				System.out.println(o1);
	    
	    //Reading OrderAddress Data
//			    OrderAddress address = orderAddressRepo.findById(2).get();
//			    System.out.println(address);
		
		 
		 
		 
	    // Updating Customer
//				Customer c2 = customerRepo.findById(101).get();
//				c2.setFirstName("Prachi");
//				customerRepo.save(c2);
	    
	    // Updating CustomerOrder
//				CustomerOrder o1 = orderRepo.findById(2).get();
//				o1.setOrderStatus(Util.status.SHIPPED);
//				orderRepo.save(o1);
//				

		 
		 
		
	    // Delete Operation
		//customerRepo.deleteAll();
		//orderRepo.deleteAll();
			
	
 }

}
