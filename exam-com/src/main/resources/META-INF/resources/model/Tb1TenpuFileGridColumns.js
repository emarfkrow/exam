/**
 * 添付ファイルグリッド定義
 */

let Tb1TenpuFileGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1TenpuFileGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1TenpuFileGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1TenpuFileGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('TENPU_FILE_BN', Messages['Tb1TenpuFileGrid.tenpuFileBn'], 80, 'primaryKey numbering', null),
    Column.text('TENPU_FILE_MEI', Messages['Tb1TenpuFileGrid.tenpuFileMei'], 300, '', null),
    Column.link('TENPU_FILE_PATH', Messages['Tb1TenpuFileGrid.tenpuFilePath'], 300, ''),
    Column.cell('INSERT_DT', Messages['Tb1TenpuFileGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1TenpuFileGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1TenpuFileGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1TenpuFileGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1TenpuFileGrid.deleteF'], 30, ''),
];
