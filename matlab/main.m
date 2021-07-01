runLimit = 100000;
hit = 0;
throw = 0;
distance = 0;
pi;

for i = 1:runLimit;
      
      x = rand;
      y = rand;
      %fprintf('%8.4f\n',9999);
      %fprintf('%8.4f\n',x);
      %fprintf('%8.4f\n',y);
      
      distance = sqrt(x^2+y^2);
      %fprintf('%8.4f\n',distance);
      
      if distance <= 1
          hit = hit + 1;
      end
      throw = throw + 1;
      %fprintf('%8.4f\n',hit);
      %fprintf('%8.4f\n',throw);
      
          pi = 4.0 * hit / throw;
          %fprintf('%8.4f\n',pi);
      t = table(throw',x',y',distance',pi','VariableNames',{'throw','x','y','distance','pi'});
      disp(t)
      
end