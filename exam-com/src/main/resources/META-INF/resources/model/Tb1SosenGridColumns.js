/**
 * 祖先グリッド定義
 */

let Tb1SosenGridColumns = [
    Column.comma('SOSEN_ID', Messages['Tb1SosenGrid.sosenId'], 80, 'primaryKey numbering', null),
    Column.text('SOSEN_MEI', Messages['Tb1SosenGrid.sosenMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1SosenGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1SosenGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1SosenGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1SosenGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1SosenGrid.deleteF'], 30, ''),
];
