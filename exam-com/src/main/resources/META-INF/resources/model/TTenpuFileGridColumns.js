/**
 * 添付ファイルグリッド定義
 */

let TTenpuFileGridColumns = [
    Column.refer('SOSEN_ID', Messages['TTenpuFileGrid.sosenId'], 150, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['TTenpuFileGrid.oyaBn'], 150, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['TTenpuFileGrid.entityBn'], 150, 'primaryKey numbering', null),
    Column.comma('TENPU_FILE_BN', Messages['TTenpuFileGrid.tenpuFileBn'], 150, 'primaryKey numbering', null),
    Column.text('TENPU_FILE_MEI', Messages['TTenpuFileGrid.tenpuFileMei'], 300, '', null),
    Column.link('TENPU_FILE_PATH', Messages['TTenpuFileGrid.tenpuFilePath'], 300, ''),
    Column.cell('INSERT_DT', Messages['TTenpuFileGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TTenpuFileGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TTenpuFileGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TTenpuFileGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TTenpuFileGrid.deleteF'], 30, ''),
];
